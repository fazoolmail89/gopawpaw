package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GlsdMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GlsdMstr
 * @author MyEclipse Persistence Tools
 */

public class GlsdMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GlsdMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GlsdMstr transientInstance) {
		log.debug("saving GlsdMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GlsdMstr persistentInstance) {
		log.debug("deleting GlsdMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GlsdMstr findById(com.gopawpaw.erp.hibernate.g.GlsdMstrId id) {
		log.debug("getting GlsdMstr instance with id: " + id);
		try {
			GlsdMstr instance = (GlsdMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GlsdMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GlsdMstr instance) {
		log.debug("finding GlsdMstr instance by example");
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
		log.debug("finding GlsdMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GlsdMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GlsdMstr instances");
		try {
			String queryString = "from GlsdMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GlsdMstr merge(GlsdMstr detachedInstance) {
		log.debug("merging GlsdMstr instance");
		try {
			GlsdMstr result = (GlsdMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GlsdMstr instance) {
		log.debug("attaching dirty GlsdMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GlsdMstr instance) {
		log.debug("attaching clean GlsdMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GlsdMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GlsdMstrDAO) ctx.getBean("GlsdMstrDAO");
	}
}