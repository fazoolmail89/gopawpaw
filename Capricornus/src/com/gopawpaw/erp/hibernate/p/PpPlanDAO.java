package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PpPlan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PpPlan
 * @author MyEclipse Persistence Tools
 */

public class PpPlanDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PpPlanDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PpPlan transientInstance) {
		log.debug("saving PpPlan instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PpPlan persistentInstance) {
		log.debug("deleting PpPlan instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PpPlan findById(com.gopawpaw.erp.hibernate.p.PpPlanId id) {
		log.debug("getting PpPlan instance with id: " + id);
		try {
			PpPlan instance = (PpPlan) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PpPlan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PpPlan instance) {
		log.debug("finding PpPlan instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PpPlan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PpPlan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PpPlan instances");
		try {
			String queryString = "from PpPlan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PpPlan merge(PpPlan detachedInstance) {
		log.debug("merging PpPlan instance");
		try {
			PpPlan result = (PpPlan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PpPlan instance) {
		log.debug("attaching dirty PpPlan instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PpPlan instance) {
		log.debug("attaching clean PpPlan instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PpPlanDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PpPlanDAO) ctx.getBean("PpPlanDAO");
	}
}