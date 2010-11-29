package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CfMstr
 * @author MyEclipse Persistence Tools
 */

public class CfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CfMstr transientInstance) {
		log.debug("saving CfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CfMstr persistentInstance) {
		log.debug("deleting CfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CfMstr findById(com.gopawpaw.erp.hibernate.c.CfMstrId id) {
		log.debug("getting CfMstr instance with id: " + id);
		try {
			CfMstr instance = (CfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CfMstr instance) {
		log.debug("finding CfMstr instance by example");
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
		log.debug("finding CfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CfMstr instances");
		try {
			String queryString = "from CfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CfMstr merge(CfMstr detachedInstance) {
		log.debug("merging CfMstr instance");
		try {
			CfMstr result = (CfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CfMstr instance) {
		log.debug("attaching dirty CfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CfMstr instance) {
		log.debug("attaching clean CfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CfMstrDAO) ctx.getBean("CfMstrDAO");
	}
}