package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DsrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DsrMstr
 * @author MyEclipse Persistence Tools
 */

public class DsrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DsrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DsrMstr transientInstance) {
		log.debug("saving DsrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DsrMstr persistentInstance) {
		log.debug("deleting DsrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DsrMstr findById(com.gopawpaw.erp.hibernate.d.DsrMstrId id) {
		log.debug("getting DsrMstr instance with id: " + id);
		try {
			DsrMstr instance = (DsrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DsrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DsrMstr instance) {
		log.debug("finding DsrMstr instance by example");
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
		log.debug("finding DsrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DsrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DsrMstr instances");
		try {
			String queryString = "from DsrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DsrMstr merge(DsrMstr detachedInstance) {
		log.debug("merging DsrMstr instance");
		try {
			DsrMstr result = (DsrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DsrMstr instance) {
		log.debug("attaching dirty DsrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DsrMstr instance) {
		log.debug("attaching clean DsrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DsrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DsrMstrDAO) ctx.getBean("DsrMstrDAO");
	}
}