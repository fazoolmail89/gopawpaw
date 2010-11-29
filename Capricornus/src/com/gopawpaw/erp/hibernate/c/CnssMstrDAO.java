package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CnssMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CnssMstr
 * @author MyEclipse Persistence Tools
 */

public class CnssMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CnssMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CnssMstr transientInstance) {
		log.debug("saving CnssMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CnssMstr persistentInstance) {
		log.debug("deleting CnssMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CnssMstr findById(com.gopawpaw.erp.hibernate.c.CnssMstrId id) {
		log.debug("getting CnssMstr instance with id: " + id);
		try {
			CnssMstr instance = (CnssMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CnssMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CnssMstr instance) {
		log.debug("finding CnssMstr instance by example");
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
		log.debug("finding CnssMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CnssMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CnssMstr instances");
		try {
			String queryString = "from CnssMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CnssMstr merge(CnssMstr detachedInstance) {
		log.debug("merging CnssMstr instance");
		try {
			CnssMstr result = (CnssMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CnssMstr instance) {
		log.debug("attaching dirty CnssMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CnssMstr instance) {
		log.debug("attaching clean CnssMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CnssMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CnssMstrDAO) ctx.getBean("CnssMstrDAO");
	}
}