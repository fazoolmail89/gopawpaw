package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VpoDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VpoDet
 * @author MyEclipse Persistence Tools
 */

public class VpoDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VpoDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VpoDet transientInstance) {
		log.debug("saving VpoDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VpoDet persistentInstance) {
		log.debug("deleting VpoDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VpoDet findById(com.gopawpaw.erp.hibernate.v.VpoDetId id) {
		log.debug("getting VpoDet instance with id: " + id);
		try {
			VpoDet instance = (VpoDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VpoDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VpoDet instance) {
		log.debug("finding VpoDet instance by example");
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
		log.debug("finding VpoDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VpoDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VpoDet instances");
		try {
			String queryString = "from VpoDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VpoDet merge(VpoDet detachedInstance) {
		log.debug("merging VpoDet instance");
		try {
			VpoDet result = (VpoDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VpoDet instance) {
		log.debug("attaching dirty VpoDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VpoDet instance) {
		log.debug("attaching clean VpoDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VpoDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VpoDetDAO) ctx.getBean("VpoDetDAO");
	}
}