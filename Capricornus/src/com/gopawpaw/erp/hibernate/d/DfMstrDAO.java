package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DfMstr
 * @author MyEclipse Persistence Tools
 */

public class DfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DfMstr transientInstance) {
		log.debug("saving DfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DfMstr persistentInstance) {
		log.debug("deleting DfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DfMstr findById(com.gopawpaw.erp.hibernate.d.DfMstrId id) {
		log.debug("getting DfMstr instance with id: " + id);
		try {
			DfMstr instance = (DfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DfMstr instance) {
		log.debug("finding DfMstr instance by example");
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
		log.debug("finding DfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DfMstr instances");
		try {
			String queryString = "from DfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DfMstr merge(DfMstr detachedInstance) {
		log.debug("merging DfMstr instance");
		try {
			DfMstr result = (DfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DfMstr instance) {
		log.debug("attaching dirty DfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DfMstr instance) {
		log.debug("attaching clean DfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DfMstrDAO) ctx.getBean("DfMstrDAO");
	}
}