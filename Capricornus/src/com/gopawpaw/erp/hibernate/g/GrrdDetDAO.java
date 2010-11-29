package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrrdDet
 * @author MyEclipse Persistence Tools
 */

public class GrrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrrdDet transientInstance) {
		log.debug("saving GrrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrrdDet persistentInstance) {
		log.debug("deleting GrrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrrdDet findById(com.gopawpaw.erp.hibernate.g.GrrdDetId id) {
		log.debug("getting GrrdDet instance with id: " + id);
		try {
			GrrdDet instance = (GrrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrrdDet instance) {
		log.debug("finding GrrdDet instance by example");
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
		log.debug("finding GrrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrrdDet instances");
		try {
			String queryString = "from GrrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrrdDet merge(GrrdDet detachedInstance) {
		log.debug("merging GrrdDet instance");
		try {
			GrrdDet result = (GrrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrrdDet instance) {
		log.debug("attaching dirty GrrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrrdDet instance) {
		log.debug("attaching clean GrrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrrdDetDAO) ctx.getBean("GrrdDetDAO");
	}
}