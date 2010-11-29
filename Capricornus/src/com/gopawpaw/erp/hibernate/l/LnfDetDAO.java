package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LnfDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LnfDet
 * @author MyEclipse Persistence Tools
 */

public class LnfDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LnfDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LnfDet transientInstance) {
		log.debug("saving LnfDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LnfDet persistentInstance) {
		log.debug("deleting LnfDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LnfDet findById(com.gopawpaw.erp.hibernate.l.LnfDetId id) {
		log.debug("getting LnfDet instance with id: " + id);
		try {
			LnfDet instance = (LnfDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LnfDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LnfDet instance) {
		log.debug("finding LnfDet instance by example");
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
		log.debug("finding LnfDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LnfDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LnfDet instances");
		try {
			String queryString = "from LnfDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LnfDet merge(LnfDet detachedInstance) {
		log.debug("merging LnfDet instance");
		try {
			LnfDet result = (LnfDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LnfDet instance) {
		log.debug("attaching dirty LnfDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LnfDet instance) {
		log.debug("attaching clean LnfDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LnfDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LnfDetDAO) ctx.getBean("LnfDetDAO");
	}
}