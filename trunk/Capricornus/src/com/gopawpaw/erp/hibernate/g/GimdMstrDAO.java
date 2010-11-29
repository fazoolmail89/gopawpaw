package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GimdMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GimdMstr
 * @author MyEclipse Persistence Tools
 */

public class GimdMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GimdMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GimdMstr transientInstance) {
		log.debug("saving GimdMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GimdMstr persistentInstance) {
		log.debug("deleting GimdMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GimdMstr findById(com.gopawpaw.erp.hibernate.g.GimdMstrId id) {
		log.debug("getting GimdMstr instance with id: " + id);
		try {
			GimdMstr instance = (GimdMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GimdMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GimdMstr instance) {
		log.debug("finding GimdMstr instance by example");
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
		log.debug("finding GimdMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GimdMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GimdMstr instances");
		try {
			String queryString = "from GimdMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GimdMstr merge(GimdMstr detachedInstance) {
		log.debug("merging GimdMstr instance");
		try {
			GimdMstr result = (GimdMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GimdMstr instance) {
		log.debug("attaching dirty GimdMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GimdMstr instance) {
		log.debug("attaching clean GimdMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GimdMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GimdMstrDAO) ctx.getBean("GimdMstrDAO");
	}
}