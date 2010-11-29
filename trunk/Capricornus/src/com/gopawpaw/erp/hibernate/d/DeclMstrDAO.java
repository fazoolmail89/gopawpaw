package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DeclMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DeclMstr
 * @author MyEclipse Persistence Tools
 */

public class DeclMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DeclMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DeclMstr transientInstance) {
		log.debug("saving DeclMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DeclMstr persistentInstance) {
		log.debug("deleting DeclMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DeclMstr findById(com.gopawpaw.erp.hibernate.d.DeclMstrId id) {
		log.debug("getting DeclMstr instance with id: " + id);
		try {
			DeclMstr instance = (DeclMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DeclMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DeclMstr instance) {
		log.debug("finding DeclMstr instance by example");
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
		log.debug("finding DeclMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DeclMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DeclMstr instances");
		try {
			String queryString = "from DeclMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DeclMstr merge(DeclMstr detachedInstance) {
		log.debug("merging DeclMstr instance");
		try {
			DeclMstr result = (DeclMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DeclMstr instance) {
		log.debug("attaching dirty DeclMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DeclMstr instance) {
		log.debug("attaching clean DeclMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DeclMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DeclMstrDAO) ctx.getBean("DeclMstrDAO");
	}
}