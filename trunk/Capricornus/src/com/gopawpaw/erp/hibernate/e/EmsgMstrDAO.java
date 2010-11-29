package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmsgMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EmsgMstr
 * @author MyEclipse Persistence Tools
 */

public class EmsgMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmsgMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EmsgMstr transientInstance) {
		log.debug("saving EmsgMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmsgMstr persistentInstance) {
		log.debug("deleting EmsgMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmsgMstr findById(com.gopawpaw.erp.hibernate.e.EmsgMstrId id) {
		log.debug("getting EmsgMstr instance with id: " + id);
		try {
			EmsgMstr instance = (EmsgMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EmsgMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmsgMstr instance) {
		log.debug("finding EmsgMstr instance by example");
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
		log.debug("finding EmsgMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmsgMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmsgMstr instances");
		try {
			String queryString = "from EmsgMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmsgMstr merge(EmsgMstr detachedInstance) {
		log.debug("merging EmsgMstr instance");
		try {
			EmsgMstr result = (EmsgMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmsgMstr instance) {
		log.debug("attaching dirty EmsgMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmsgMstr instance) {
		log.debug("attaching clean EmsgMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmsgMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmsgMstrDAO) ctx.getBean("EmsgMstrDAO");
	}
}