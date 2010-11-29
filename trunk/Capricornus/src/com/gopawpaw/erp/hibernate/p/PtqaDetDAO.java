package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtqaDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtqaDet
 * @author MyEclipse Persistence Tools
 */

public class PtqaDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtqaDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtqaDet transientInstance) {
		log.debug("saving PtqaDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtqaDet persistentInstance) {
		log.debug("deleting PtqaDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtqaDet findById(com.gopawpaw.erp.hibernate.p.PtqaDetId id) {
		log.debug("getting PtqaDet instance with id: " + id);
		try {
			PtqaDet instance = (PtqaDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtqaDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtqaDet instance) {
		log.debug("finding PtqaDet instance by example");
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
		log.debug("finding PtqaDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtqaDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtqaDet instances");
		try {
			String queryString = "from PtqaDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtqaDet merge(PtqaDet detachedInstance) {
		log.debug("merging PtqaDet instance");
		try {
			PtqaDet result = (PtqaDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtqaDet instance) {
		log.debug("attaching dirty PtqaDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtqaDet instance) {
		log.debug("attaching clean PtqaDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtqaDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtqaDetDAO) ctx.getBean("PtqaDetDAO");
	}
}