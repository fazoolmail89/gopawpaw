package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrxMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrxMstr
 * @author MyEclipse Persistence Tools
 */

public class GrxMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrxMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrxMstr transientInstance) {
		log.debug("saving GrxMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrxMstr persistentInstance) {
		log.debug("deleting GrxMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrxMstr findById(com.gopawpaw.erp.hibernate.g.GrxMstrId id) {
		log.debug("getting GrxMstr instance with id: " + id);
		try {
			GrxMstr instance = (GrxMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrxMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrxMstr instance) {
		log.debug("finding GrxMstr instance by example");
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
		log.debug("finding GrxMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrxMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrxMstr instances");
		try {
			String queryString = "from GrxMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrxMstr merge(GrxMstr detachedInstance) {
		log.debug("merging GrxMstr instance");
		try {
			GrxMstr result = (GrxMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrxMstr instance) {
		log.debug("attaching dirty GrxMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrxMstr instance) {
		log.debug("attaching clean GrxMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrxMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrxMstrDAO) ctx.getBean("GrxMstrDAO");
	}
}