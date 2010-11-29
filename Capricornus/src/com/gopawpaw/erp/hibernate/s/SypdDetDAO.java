package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SypdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SypdDet
 * @author MyEclipse Persistence Tools
 */

public class SypdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SypdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SypdDet transientInstance) {
		log.debug("saving SypdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SypdDet persistentInstance) {
		log.debug("deleting SypdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SypdDet findById(com.gopawpaw.erp.hibernate.s.SypdDetId id) {
		log.debug("getting SypdDet instance with id: " + id);
		try {
			SypdDet instance = (SypdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SypdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SypdDet instance) {
		log.debug("finding SypdDet instance by example");
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
		log.debug("finding SypdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SypdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SypdDet instances");
		try {
			String queryString = "from SypdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SypdDet merge(SypdDet detachedInstance) {
		log.debug("merging SypdDet instance");
		try {
			SypdDet result = (SypdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SypdDet instance) {
		log.debug("attaching dirty SypdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SypdDet instance) {
		log.debug("attaching clean SypdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SypdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SypdDetDAO) ctx.getBean("SypdDetDAO");
	}
}