package com.gopawpaw.frame.struct.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MndDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.frame.struct.m.MndDet
 * @author MyEclipse Persistence Tools
 */

public class MndDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MndDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MndDet transientInstance) {
		log.debug("saving MndDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MndDet persistentInstance) {
		log.debug("deleting MndDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MndDet findById(com.gopawpaw.frame.struct.m.MndDetId id) {
		log.debug("getting MndDet instance with id: " + id);
		try {
			MndDet instance = (MndDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MndDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MndDet instance) {
		log.debug("finding MndDet instance by example");
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
		log.debug("finding MndDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MndDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MndDet instances");
		try {
			String queryString = "from MndDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MndDet merge(MndDet detachedInstance) {
		log.debug("merging MndDet instance");
		try {
			MndDet result = (MndDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MndDet instance) {
		log.debug("attaching dirty MndDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MndDet instance) {
		log.debug("attaching clean MndDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MndDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MndDetDAO) ctx.getBean("MndDetDAO");
	}
}