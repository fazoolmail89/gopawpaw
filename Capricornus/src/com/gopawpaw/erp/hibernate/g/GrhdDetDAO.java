package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrhdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrhdDet
 * @author MyEclipse Persistence Tools
 */

public class GrhdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrhdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrhdDet transientInstance) {
		log.debug("saving GrhdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrhdDet persistentInstance) {
		log.debug("deleting GrhdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrhdDet findById(com.gopawpaw.erp.hibernate.g.GrhdDetId id) {
		log.debug("getting GrhdDet instance with id: " + id);
		try {
			GrhdDet instance = (GrhdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrhdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrhdDet instance) {
		log.debug("finding GrhdDet instance by example");
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
		log.debug("finding GrhdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrhdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrhdDet instances");
		try {
			String queryString = "from GrhdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrhdDet merge(GrhdDet detachedInstance) {
		log.debug("merging GrhdDet instance");
		try {
			GrhdDet result = (GrhdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrhdDet instance) {
		log.debug("attaching dirty GrhdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrhdDet instance) {
		log.debug("attaching clean GrhdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrhdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrhdDetDAO) ctx.getBean("GrhdDetDAO");
	}
}