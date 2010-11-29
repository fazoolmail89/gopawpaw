package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CpcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CpcMstr
 * @author MyEclipse Persistence Tools
 */

public class CpcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CpcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CpcMstr transientInstance) {
		log.debug("saving CpcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CpcMstr persistentInstance) {
		log.debug("deleting CpcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CpcMstr findById(com.gopawpaw.erp.hibernate.c.CpcMstrId id) {
		log.debug("getting CpcMstr instance with id: " + id);
		try {
			CpcMstr instance = (CpcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CpcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CpcMstr instance) {
		log.debug("finding CpcMstr instance by example");
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
		log.debug("finding CpcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CpcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CpcMstr instances");
		try {
			String queryString = "from CpcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CpcMstr merge(CpcMstr detachedInstance) {
		log.debug("merging CpcMstr instance");
		try {
			CpcMstr result = (CpcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CpcMstr instance) {
		log.debug("attaching dirty CpcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CpcMstr instance) {
		log.debug("attaching clean CpcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CpcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CpcMstrDAO) ctx.getBean("CpcMstrDAO");
	}
}