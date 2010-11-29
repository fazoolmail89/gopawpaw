package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GraMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GraMstr
 * @author MyEclipse Persistence Tools
 */

public class GraMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GraMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GraMstr transientInstance) {
		log.debug("saving GraMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GraMstr persistentInstance) {
		log.debug("deleting GraMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GraMstr findById(com.gopawpaw.erp.hibernate.g.GraMstrId id) {
		log.debug("getting GraMstr instance with id: " + id);
		try {
			GraMstr instance = (GraMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GraMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GraMstr instance) {
		log.debug("finding GraMstr instance by example");
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
		log.debug("finding GraMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GraMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GraMstr instances");
		try {
			String queryString = "from GraMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GraMstr merge(GraMstr detachedInstance) {
		log.debug("merging GraMstr instance");
		try {
			GraMstr result = (GraMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GraMstr instance) {
		log.debug("attaching dirty GraMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GraMstr instance) {
		log.debug("attaching clean GraMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GraMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GraMstrDAO) ctx.getBean("GraMstrDAO");
	}
}