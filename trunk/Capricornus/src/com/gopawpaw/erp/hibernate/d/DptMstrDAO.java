package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DptMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DptMstr
 * @author MyEclipse Persistence Tools
 */

public class DptMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DptMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DptMstr transientInstance) {
		log.debug("saving DptMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DptMstr persistentInstance) {
		log.debug("deleting DptMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DptMstr findById(com.gopawpaw.erp.hibernate.d.DptMstrId id) {
		log.debug("getting DptMstr instance with id: " + id);
		try {
			DptMstr instance = (DptMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DptMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DptMstr instance) {
		log.debug("finding DptMstr instance by example");
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
		log.debug("finding DptMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DptMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DptMstr instances");
		try {
			String queryString = "from DptMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DptMstr merge(DptMstr detachedInstance) {
		log.debug("merging DptMstr instance");
		try {
			DptMstr result = (DptMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DptMstr instance) {
		log.debug("attaching dirty DptMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DptMstr instance) {
		log.debug("attaching clean DptMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DptMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DptMstrDAO) ctx.getBean("DptMstrDAO");
	}
}