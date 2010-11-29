package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MnpDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MnpDet
 * @author MyEclipse Persistence Tools
 */

public class MnpDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MnpDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MnpDet transientInstance) {
		log.debug("saving MnpDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MnpDet persistentInstance) {
		log.debug("deleting MnpDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MnpDet findById(com.gopawpaw.erp.hibernate.m.MnpDetId id) {
		log.debug("getting MnpDet instance with id: " + id);
		try {
			MnpDet instance = (MnpDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MnpDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MnpDet instance) {
		log.debug("finding MnpDet instance by example");
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
		log.debug("finding MnpDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MnpDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MnpDet instances");
		try {
			String queryString = "from MnpDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MnpDet merge(MnpDet detachedInstance) {
		log.debug("merging MnpDet instance");
		try {
			MnpDet result = (MnpDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MnpDet instance) {
		log.debug("attaching dirty MnpDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MnpDet instance) {
		log.debug("attaching clean MnpDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MnpDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MnpDetDAO) ctx.getBean("MnpDetDAO");
	}
}