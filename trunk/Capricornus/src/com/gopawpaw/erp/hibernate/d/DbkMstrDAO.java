package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DbkMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DbkMstr
 * @author MyEclipse Persistence Tools
 */

public class DbkMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DbkMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DbkMstr transientInstance) {
		log.debug("saving DbkMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DbkMstr persistentInstance) {
		log.debug("deleting DbkMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DbkMstr findById(com.gopawpaw.erp.hibernate.d.DbkMstrId id) {
		log.debug("getting DbkMstr instance with id: " + id);
		try {
			DbkMstr instance = (DbkMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DbkMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DbkMstr instance) {
		log.debug("finding DbkMstr instance by example");
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
		log.debug("finding DbkMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DbkMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DbkMstr instances");
		try {
			String queryString = "from DbkMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DbkMstr merge(DbkMstr detachedInstance) {
		log.debug("merging DbkMstr instance");
		try {
			DbkMstr result = (DbkMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DbkMstr instance) {
		log.debug("attaching dirty DbkMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DbkMstr instance) {
		log.debug("attaching clean DbkMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DbkMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DbkMstrDAO) ctx.getBean("DbkMstrDAO");
	}
}