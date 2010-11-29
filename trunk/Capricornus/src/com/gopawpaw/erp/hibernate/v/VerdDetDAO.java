package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VerdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VerdDet
 * @author MyEclipse Persistence Tools
 */

public class VerdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VerdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VerdDet transientInstance) {
		log.debug("saving VerdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VerdDet persistentInstance) {
		log.debug("deleting VerdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VerdDet findById(com.gopawpaw.erp.hibernate.v.VerdDetId id) {
		log.debug("getting VerdDet instance with id: " + id);
		try {
			VerdDet instance = (VerdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VerdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VerdDet instance) {
		log.debug("finding VerdDet instance by example");
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
		log.debug("finding VerdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VerdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VerdDet instances");
		try {
			String queryString = "from VerdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VerdDet merge(VerdDet detachedInstance) {
		log.debug("merging VerdDet instance");
		try {
			VerdDet result = (VerdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VerdDet instance) {
		log.debug("attaching dirty VerdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VerdDet instance) {
		log.debug("attaching clean VerdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VerdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VerdDetDAO) ctx.getBean("VerdDetDAO");
	}
}