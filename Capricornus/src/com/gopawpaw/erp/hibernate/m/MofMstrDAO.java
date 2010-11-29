package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MofMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MofMstr
 * @author MyEclipse Persistence Tools
 */

public class MofMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MofMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MofMstr transientInstance) {
		log.debug("saving MofMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MofMstr persistentInstance) {
		log.debug("deleting MofMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MofMstr findById(java.lang.String id) {
		log.debug("getting MofMstr instance with id: " + id);
		try {
			MofMstr instance = (MofMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MofMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MofMstr instance) {
		log.debug("finding MofMstr instance by example");
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
		log.debug("finding MofMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MofMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MofMstr instances");
		try {
			String queryString = "from MofMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MofMstr merge(MofMstr detachedInstance) {
		log.debug("merging MofMstr instance");
		try {
			MofMstr result = (MofMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MofMstr instance) {
		log.debug("attaching dirty MofMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MofMstr instance) {
		log.debug("attaching clean MofMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MofMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MofMstrDAO) ctx.getBean("MofMstrDAO");
	}
}