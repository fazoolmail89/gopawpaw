package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CslmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CslmMstr
 * @author MyEclipse Persistence Tools
 */

public class CslmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CslmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CslmMstr transientInstance) {
		log.debug("saving CslmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CslmMstr persistentInstance) {
		log.debug("deleting CslmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CslmMstr findById(com.gopawpaw.erp.hibernate.c.CslmMstrId id) {
		log.debug("getting CslmMstr instance with id: " + id);
		try {
			CslmMstr instance = (CslmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CslmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CslmMstr instance) {
		log.debug("finding CslmMstr instance by example");
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
		log.debug("finding CslmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CslmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CslmMstr instances");
		try {
			String queryString = "from CslmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CslmMstr merge(CslmMstr detachedInstance) {
		log.debug("merging CslmMstr instance");
		try {
			CslmMstr result = (CslmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CslmMstr instance) {
		log.debug("attaching dirty CslmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CslmMstr instance) {
		log.debug("attaching clean CslmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CslmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CslmMstrDAO) ctx.getBean("CslmMstrDAO");
	}
}