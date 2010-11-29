package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ScxRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ScxRef
 * @author MyEclipse Persistence Tools
 */

public class ScxRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ScxRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ScxRef transientInstance) {
		log.debug("saving ScxRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ScxRef persistentInstance) {
		log.debug("deleting ScxRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ScxRef findById(com.gopawpaw.erp.hibernate.s.ScxRefId id) {
		log.debug("getting ScxRef instance with id: " + id);
		try {
			ScxRef instance = (ScxRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ScxRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ScxRef instance) {
		log.debug("finding ScxRef instance by example");
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
		log.debug("finding ScxRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ScxRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ScxRef instances");
		try {
			String queryString = "from ScxRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ScxRef merge(ScxRef detachedInstance) {
		log.debug("merging ScxRef instance");
		try {
			ScxRef result = (ScxRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ScxRef instance) {
		log.debug("attaching dirty ScxRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ScxRef instance) {
		log.debug("attaching clean ScxRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ScxRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ScxRefDAO) ctx.getBean("ScxRefDAO");
	}
}