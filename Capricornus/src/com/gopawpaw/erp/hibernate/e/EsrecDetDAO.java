package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsrecDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsrecDet
 * @author MyEclipse Persistence Tools
 */

public class EsrecDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsrecDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsrecDet transientInstance) {
		log.debug("saving EsrecDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsrecDet persistentInstance) {
		log.debug("deleting EsrecDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsrecDet findById(com.gopawpaw.erp.hibernate.e.EsrecDetId id) {
		log.debug("getting EsrecDet instance with id: " + id);
		try {
			EsrecDet instance = (EsrecDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsrecDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsrecDet instance) {
		log.debug("finding EsrecDet instance by example");
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
		log.debug("finding EsrecDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsrecDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsrecDet instances");
		try {
			String queryString = "from EsrecDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsrecDet merge(EsrecDet detachedInstance) {
		log.debug("merging EsrecDet instance");
		try {
			EsrecDet result = (EsrecDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsrecDet instance) {
		log.debug("attaching dirty EsrecDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsrecDet instance) {
		log.debug("attaching clean EsrecDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsrecDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsrecDetDAO) ctx.getBean("EsrecDetDAO");
	}
}