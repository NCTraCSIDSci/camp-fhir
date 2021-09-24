package main.java.com.campfhir.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

import main.java.com.campfhir.model.MedicationRequest;
import main.java.com.campfhir.model.Patient;

import main.java.utils.HibernateBaseDB;

import java.sql.*;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class MedicationRequestDao implements MedicationRequestDaoInterface<MedicationRequest, String> 
{
	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;
	private Statement stmt;
	private ResultSet rs;

	public MedicationRequestDao() {}

	public Session openCurrentSession() throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory();
		currentSession = sessionFactory.openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory();
		currentSession = sessionFactory.openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() 
	{
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() 
	{
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() 
	{
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() 
	{
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) 
	{
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() 
	{
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) 
	{
		this.currentTransaction = currentTransaction;
	}

	public void persist(MedicationRequest entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update(MedicationRequest entity) 
	{
		getCurrentSession().update(entity);
	}

	public MedicationRequest findById(String id) 
	{
		MedicationRequest medication = (MedicationRequest) getCurrentSession().get(MedicationRequest.class, id);
		return medication; 
	}

	public void delete(MedicationRequest entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<MedicationRequest> findAll(String p, Connection con) 
	{
		List<MedicationRequest> ml = new ArrayList<MedicationRequest>();
		

			  
			//step4 execute query  
  
		
		String sql = "with basetbl as ( " + 
				"select distinct  " + 
				"obs.patient_num||'-'||obs.encounter_num||'-'||REGEXP_REPLACE(obs.provider_id,'^NPI:','')||'-'|| " + 
				"to_char(obs.start_date, 'DD-MON-YYYY')||'-'||REGEXP_REPLACE(obs.concept_cd,'^MDCTN:','')||'-'||obs.instance_num as MED_IDENTIFIER, " + 
				"'Patient/'||obs.patient_num as MED_SUBJECT_REFERENCE, " + 
				"'Encounter/'||obs.encounter_num as MED_CONTEXT_REFERENCE, " + 
				"null as MED_MEDREF_REFERENCE, " + 
				"case when rxn.RXNORM_CD is not null then rxn.RXNORM_CD else 'INTERNAL CODE' end as MED_MEDCODCON_CODING_CODE, " + 
				"'http://www.nlm.nih.gov/research/umls/rxnorm' as MED_MEDCODCON_CODING_SYS, " + 
				"t4.NAME_CHAR as MED_MEDCODCON_CODING_DISPLAY, " + 
				"null as MED_AUTHORED_ON, " + 
				"obs.START_DATE as MED_DISPREQ_PERIOD_START, " + 
				"obs.END_DATE as MED_DISPREQ_PERIOD_END, " + 
				"case when REGEXP_REPLACE(obs.provider_id,'^NPI:','') = '99999999999' then null " + 
				"	 else 'Practitioner/'|| REGEXP_REPLACE(obs.provider_id,'^NPI:','') end as MED_REQ_AGENT_REFERENCE, " + 
				"'order' as MED_INTENT_CODE, " + 
				"null as MED_CAT_CODING_SYS, " + 
				"null as MED_CAT_CODING_CODE, " + 
				"null as MED_CAT_CODING_DISPLAY, " + 
				"null as MED_DISPREQ_EXPSUPP, " + 
				"null as MED_DOSINSTX_TEXT, " + 
				"null as MED_DOSINSTX_ASNDBOOL, " + 
				"null as MED_SUBSTITU_ALLOWED " + 
				"from unc_cdwdata.observation_fact_med obs " + 
				"join cohort_trans_2014 v on obs.patient_num=v.patient_num " + 
				"join UNC_CDWDATA.CONCEPT_DIMENSION t4 on t4.CONCEPT_CD = obs.CONCEPT_CD " + 
				"left join UNC_FHIR_MAPPINGS tcc1 on tcc1.column_cd='MED:TVAL_CHAR' and obs.tval_char=tcc1.unc_in_cd " + 
				"left join unc_cdwdata.RXNORM_UNC_SMORES_Q2_2019 rxn ON REGEXP_REPLACE(obs.concept_cd,'^MDCTN:','') = rxn.MDCTN_CD " + 
				"where " + 

				"obs.patient_num = '"+p+"' " + 
				"), " + 
				"dose as ( " + 
				"select distinct " + 
				"obs.patient_num||'-'||obs.encounter_num||'-'||REGEXP_REPLACE(obs.provider_id,'^NPI:','')||'-'|| " + 
				"to_char(obs.start_date, 'DD-MON-YYYY')||'-'||REGEXP_REPLACE(obs.concept_cd,'^MDCTN:','')||'-'||obs.instance_num as MED_IDENTIFIER, " + 
				"obs.NVAL_NUM as MED_DOSINSTX_DOSEQUANT_VAL, " + 
				"obs.UNITS_CD as MED_DOSINSTX_DOSEQUANT_UNIT " + 
				"from unc_cdwdata.observation_fact_med obs " + 
				"join cohort_trans_2014 v on obs.patient_num=v.patient_num " + 
				"where " + 
				"obs.modifier_cd='MED:DOSE' " + 
				" " + 
				"and " + 
				"obs.patient_num = '"+p+"' " + 
				"), " + 
				"quantity as ( " + 
				"select distinct " + 
				"obs.patient_num||'-'||obs.encounter_num||'-'||REGEXP_REPLACE(obs.provider_id,'^NPI:','')||'-'|| " + 
				"to_char(obs.start_date, 'DD-MON-YYYY')||'-'||REGEXP_REPLACE(obs.concept_cd,'^MDCTN:','')||'-'||obs.instance_num as MED_IDENTIFIER, " + 
				"obs.NVAL_NUM as MED_DISPREQ_QUANT " + 
				"from unc_cdwdata.observation_fact_med obs " + 
				"join cohort_trans_2014 v on obs.patient_num=v.patient_num " + 
				"where " + 
				"obs.modifier_cd='MED:QUANTITY' " + 
				"and " + 
				"obs.patient_num = '"+p+"' " + 
				"), " + 
				"route as ( " + 
				"select distinct " + 
				"obs.patient_num||'-'||obs.encounter_num||'-'||REGEXP_REPLACE(obs.provider_id,'^NPI:','')||'-'|| " + 
				"to_char(obs.start_date, 'DD-MON-YYYY')||'-'||REGEXP_REPLACE(obs.concept_cd,'^MDCTN:','')||'-'||obs.instance_num as MED_IDENTIFIER, " + 
				"obs.TVAL_CHAR as MED_DOSINSTX_ROUTE " + 
				"from unc_cdwdata.observation_fact_med obs " + 
				"join cohort_trans_2014 v on obs.patient_num=v.patient_num " + 
				"where " + 
				"obs.modifier_cd='MED:ROUTE' " + 
				"and " + 
				"obs.patient_num = '"+p+"' " + 
				"), " + 
				"refills as ( " + 
				"select distinct " + 
				"obs.patient_num||'-'||obs.encounter_num||'-'||REGEXP_REPLACE(obs.provider_id,'^NPI:','')||'-'|| " + 
				"to_char(obs.start_date, 'DD-MON-YYYY')||'-'||REGEXP_REPLACE(obs.concept_cd,'^MDCTN:','')||'-'||obs.instance_num as MED_IDENTIFIER, " + 
				"obs.NVAL_NUM as MED_DISPREQ_NUMREPS " + 
				"from unc_cdwdata.observation_fact_med obs " + 
				"join cohort_trans_2014 v on obs.patient_num=v.patient_num " + 
				"where " + 
				"obs.modifier_cd='MED:REFILLS' " + 
				"and " + 
				"obs.patient_num = '"+p+"' " + 
				") " + 
				"select distinct " + 
				"basetbl.\"MED_IDENTIFIER\",basetbl.\"MED_SUBJECT_REFERENCE\",basetbl.\"MED_CONTEXT_REFERENCE\",basetbl.\"MED_MEDREF_REFERENCE\",basetbl.\"MED_MEDCODCON_CODING_CODE\",basetbl.\"MED_MEDCODCON_CODING_SYS\",basetbl.\"MED_MEDCODCON_CODING_DISPLAY\",basetbl.\"MED_AUTHORED_ON\",basetbl.\"MED_DISPREQ_PERIOD_START\",basetbl.\"MED_DISPREQ_PERIOD_END\",basetbl.\"MED_REQ_AGENT_REFERENCE\",basetbl.\"MED_INTENT_CODE\",basetbl.\"MED_CAT_CODING_SYS\",basetbl.\"MED_CAT_CODING_CODE\",basetbl.\"MED_CAT_CODING_DISPLAY\",basetbl.\"MED_DISPREQ_EXPSUPP\",basetbl.\"MED_DOSINSTX_TEXT\",basetbl.\"MED_DOSINSTX_ASNDBOOL\",basetbl.\"MED_SUBSTITU_ALLOWED\", " + 
				"dose.MED_DOSINSTX_DOSEQUANT_VAL, " + 
				"dose.MED_DOSINSTX_DOSEQUANT_UNIT, " + 
				"quantity.MED_DISPREQ_QUANT, " + 
				"route.MED_DOSINSTX_ROUTE, " + 
				"refills.MED_DISPREQ_NUMREPS " + 
				"from " + 
				"basetbl LEFT JOIN dose on basetbl.MED_IDENTIFIER = dose.MED_IDENTIFIER " + 
				"LEFT JOIN quantity on basetbl.MED_IDENTIFIER = quantity.MED_IDENTIFIER " + 
				"LEFT JOIN route on basetbl.MED_IDENTIFIER = route.MED_IDENTIFIER " + 
				"LEFT JOIN refills on basetbl.MED_IDENTIFIER = refills.MED_IDENTIFIER";
		
			try {
					  
					stmt = con.createStatement();  
					rs = stmt.executeQuery(sql);

				
				
				
				while ( rs.next() ) 
				{
					MedicationRequest medication = new MedicationRequest();
					medication.setMED_IDENTIFIER(rs.getString(1));
					medication.setMED_SUBJECT_REFERENCE(rs.getString(2));
					medication.setMED_CONTEXT_REFERENCE(rs.getString(3));
					medication.setMED_MEDREF_REFERENCE(rs.getString(4));
					medication.setMED_MEDCODCON_CODING_CODE(rs.getString(5));
					medication.setMED_MEDCODCON_CODING_SYS(rs.getString(6));
					medication.setMED_MEDCODCON_CODING_DISPLAY(rs.getString(7));
					medication.setMED_AUTHORED_ON(rs.getString(8));
					medication.setMED_DISPREQ_PERIOD_START(rs.getString(9));
					medication.setMED_DISPREQ_PERIOD_END(rs.getString(10));
					medication.setMED_REQ_AGENT_REFERENCE(rs.getString(11));
					medication.setMED_INTENT_CODE(rs.getString(12));
					medication.setMED_CAT_CODING_SYS(rs.getString(13));
					medication.setMED_CAT_CODING_CODE(rs.getString(14));
					medication.setMED_CAT_CODING_DISPLAY(rs.getString(15));
					medication.setMED_DISPREQ_EXPSUPP(rs.getString(16));
					medication.setMED_DOSINSTX_TEXT(rs.getString(17));
					medication.setMED_DOSINSTX_ASNDBOOL(rs.getString(18));
					medication.setMED_SUBSTITU_ALLOWED(rs.getString(19));
					medication.setMED_DOSINSTX_DOSEQUANT_VAL(rs.getString(20));
					medication.setMED_DOSINSTX_DOSEQUANT_UNIT(rs.getString(21));
					medication.setMED_DISPREQ_QUANT(rs.getString(22));
					medication.setMED_DOSINSTX_ROUTE(rs.getString(23));
					medication.setMED_DISPREQ_NUMREPS(rs.getString(24));					
					
					ml.add(medication);
					
					medication = null;
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}  
					

				 		  


		return ml;
	}
	
	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{
		ScrollableResults medication = getCurrentSession().createQuery("FROM MedicationRequest")
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
		
		return medication;
	}

	public void deleteAll() 
	{
//		List<MedicationRequest> entityList = findAll();
//		for (MedicationRequest entity : entityList) {
//			delete(entity);
//		}
	}
}
