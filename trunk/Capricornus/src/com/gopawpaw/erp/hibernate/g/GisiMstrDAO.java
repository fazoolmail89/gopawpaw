package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GisiMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GisiMstr
 * @author MyEclipse Persistence Tools
 */

public class GisiMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GisiMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GisiMstr transientInstance) {
		log.debug("saving GisiMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GisiMstr persistentInstance) {
		log.debug("deleting GisiMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GisiMstr findById(com.gopawpaw.erp.hibernate.g.GisiMstrId id) {
		log.debug("getting GisiMstr instance with id: " + id);
		try {
			GisiMstr instance = (GisiMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GisiMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GisiMstr instance) {
		log.debug("finding GisiMstr instance by example");
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
		log.debug("finding GisiMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GisiMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GisiMstr instances");
		try {
			String queryString = "from GisiMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GisiMstr merge(GisiMstr detachedInstance) {
		log.debug("merging GisiMstr instance");
		try {
			GisiMstr result = (GisiMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GisiMstr instance) {
		log.debug("attaching dirty GisiMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GisiMstr instance) {
		log.debug("attaching clean GisiMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GisiMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GisiMstrDAO) ctx.getBean("GisiMstrDAO");
	}
}