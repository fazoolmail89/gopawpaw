package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DyMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DyMstr
 * @author MyEclipse Persistence Tools
 */

public class DyMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DyMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DyMstr transientInstance) {
		log.debug("saving DyMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DyMstr persistentInstance) {
		log.debug("deleting DyMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DyMstr findById(com.gopawpaw.erp.hibernate.d.DyMstrId id) {
		log.debug("getting DyMstr instance with id: " + id);
		try {
			DyMstr instance = (DyMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DyMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DyMstr instance) {
		log.debug("finding DyMstr instance by example");
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
		log.debug("finding DyMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DyMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DyMstr instances");
		try {
			String queryString = "from DyMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DyMstr merge(DyMstr detachedInstance) {
		log.debug("merging DyMstr instance");
		try {
			DyMstr result = (DyMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DyMstr instance) {
		log.debug("attaching dirty DyMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DyMstr instance) {
		log.debug("attaching clean DyMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DyMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DyMstrDAO) ctx.getBean("DyMstrDAO");
	}
}