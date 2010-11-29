package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DydMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DydMstr
 * @author MyEclipse Persistence Tools
 */

public class DydMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DydMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DydMstr transientInstance) {
		log.debug("saving DydMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DydMstr persistentInstance) {
		log.debug("deleting DydMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DydMstr findById(com.gopawpaw.erp.hibernate.d.DydMstrId id) {
		log.debug("getting DydMstr instance with id: " + id);
		try {
			DydMstr instance = (DydMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DydMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DydMstr instance) {
		log.debug("finding DydMstr instance by example");
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
		log.debug("finding DydMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DydMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DydMstr instances");
		try {
			String queryString = "from DydMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DydMstr merge(DydMstr detachedInstance) {
		log.debug("merging DydMstr instance");
		try {
			DydMstr result = (DydMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DydMstr instance) {
		log.debug("attaching dirty DydMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DydMstr instance) {
		log.debug("attaching clean DydMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DydMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DydMstrDAO) ctx.getBean("DydMstrDAO");
	}
}