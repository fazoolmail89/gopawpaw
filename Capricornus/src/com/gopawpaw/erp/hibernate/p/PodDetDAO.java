package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PodDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PodDet
 * @author MyEclipse Persistence Tools
 */

public class PodDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PodDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PodDet transientInstance) {
		log.debug("saving PodDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PodDet persistentInstance) {
		log.debug("deleting PodDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PodDet findById(com.gopawpaw.erp.hibernate.p.PodDetId id) {
		log.debug("getting PodDet instance with id: " + id);
		try {
			PodDet instance = (PodDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PodDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PodDet instance) {
		log.debug("finding PodDet instance by example");
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
		log.debug("finding PodDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PodDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PodDet instances");
		try {
			String queryString = "from PodDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PodDet merge(PodDet detachedInstance) {
		log.debug("merging PodDet instance");
		try {
			PodDet result = (PodDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PodDet instance) {
		log.debug("attaching dirty PodDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PodDet instance) {
		log.debug("attaching clean PodDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PodDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PodDetDAO) ctx.getBean("PodDetDAO");
	}
}