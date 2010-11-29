package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GltrHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GltrHist
 * @author MyEclipse Persistence Tools
 */

public class GltrHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GltrHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GltrHist transientInstance) {
		log.debug("saving GltrHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GltrHist persistentInstance) {
		log.debug("deleting GltrHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GltrHist findById(com.gopawpaw.erp.hibernate.g.GltrHistId id) {
		log.debug("getting GltrHist instance with id: " + id);
		try {
			GltrHist instance = (GltrHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GltrHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GltrHist instance) {
		log.debug("finding GltrHist instance by example");
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
		log.debug("finding GltrHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GltrHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GltrHist instances");
		try {
			String queryString = "from GltrHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GltrHist merge(GltrHist detachedInstance) {
		log.debug("merging GltrHist instance");
		try {
			GltrHist result = (GltrHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GltrHist instance) {
		log.debug("attaching dirty GltrHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GltrHist instance) {
		log.debug("attaching clean GltrHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GltrHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GltrHistDAO) ctx.getBean("GltrHistDAO");
	}
}