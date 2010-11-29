package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CnsixMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CnsixMstr
 * @author MyEclipse Persistence Tools
 */

public class CnsixMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CnsixMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CnsixMstr transientInstance) {
		log.debug("saving CnsixMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CnsixMstr persistentInstance) {
		log.debug("deleting CnsixMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CnsixMstr findById(com.gopawpaw.erp.hibernate.c.CnsixMstrId id) {
		log.debug("getting CnsixMstr instance with id: " + id);
		try {
			CnsixMstr instance = (CnsixMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CnsixMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CnsixMstr instance) {
		log.debug("finding CnsixMstr instance by example");
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
		log.debug("finding CnsixMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CnsixMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CnsixMstr instances");
		try {
			String queryString = "from CnsixMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CnsixMstr merge(CnsixMstr detachedInstance) {
		log.debug("merging CnsixMstr instance");
		try {
			CnsixMstr result = (CnsixMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CnsixMstr instance) {
		log.debug("attaching dirty CnsixMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CnsixMstr instance) {
		log.debug("attaching clean CnsixMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CnsixMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CnsixMstrDAO) ctx.getBean("CnsixMstrDAO");
	}
}