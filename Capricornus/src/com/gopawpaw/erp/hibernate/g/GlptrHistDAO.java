package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GlptrHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GlptrHist
 * @author MyEclipse Persistence Tools
 */

public class GlptrHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GlptrHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GlptrHist transientInstance) {
		log.debug("saving GlptrHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GlptrHist persistentInstance) {
		log.debug("deleting GlptrHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GlptrHist findById(com.gopawpaw.erp.hibernate.g.GlptrHistId id) {
		log.debug("getting GlptrHist instance with id: " + id);
		try {
			GlptrHist instance = (GlptrHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GlptrHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GlptrHist instance) {
		log.debug("finding GlptrHist instance by example");
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
		log.debug("finding GlptrHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GlptrHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GlptrHist instances");
		try {
			String queryString = "from GlptrHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GlptrHist merge(GlptrHist detachedInstance) {
		log.debug("merging GlptrHist instance");
		try {
			GlptrHist result = (GlptrHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GlptrHist instance) {
		log.debug("attaching dirty GlptrHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GlptrHist instance) {
		log.debug("attaching clean GlptrHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GlptrHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GlptrHistDAO) ctx.getBean("GlptrHistDAO");
	}
}