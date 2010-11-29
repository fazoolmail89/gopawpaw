package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CssMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CssMstr
 * @author MyEclipse Persistence Tools
 */

public class CssMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CssMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CssMstr transientInstance) {
		log.debug("saving CssMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CssMstr persistentInstance) {
		log.debug("deleting CssMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CssMstr findById(com.gopawpaw.erp.hibernate.c.CssMstrId id) {
		log.debug("getting CssMstr instance with id: " + id);
		try {
			CssMstr instance = (CssMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CssMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CssMstr instance) {
		log.debug("finding CssMstr instance by example");
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
		log.debug("finding CssMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CssMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CssMstr instances");
		try {
			String queryString = "from CssMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CssMstr merge(CssMstr detachedInstance) {
		log.debug("merging CssMstr instance");
		try {
			CssMstr result = (CssMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CssMstr instance) {
		log.debug("attaching dirty CssMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CssMstr instance) {
		log.debug("attaching clean CssMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CssMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CssMstrDAO) ctx.getBean("CssMstrDAO");
	}
}