package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GradDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GradDet
 * @author MyEclipse Persistence Tools
 */

public class GradDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GradDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GradDet transientInstance) {
		log.debug("saving GradDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GradDet persistentInstance) {
		log.debug("deleting GradDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GradDet findById(com.gopawpaw.erp.hibernate.g.GradDetId id) {
		log.debug("getting GradDet instance with id: " + id);
		try {
			GradDet instance = (GradDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GradDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GradDet instance) {
		log.debug("finding GradDet instance by example");
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
		log.debug("finding GradDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GradDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GradDet instances");
		try {
			String queryString = "from GradDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GradDet merge(GradDet detachedInstance) {
		log.debug("merging GradDet instance");
		try {
			GradDet result = (GradDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GradDet instance) {
		log.debug("attaching dirty GradDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GradDet instance) {
		log.debug("attaching clean GradDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GradDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GradDetDAO) ctx.getBean("GradDetDAO");
	}
}