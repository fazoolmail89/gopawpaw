package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CrMstr
 * @author MyEclipse Persistence Tools
 */

public class CrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CrMstr transientInstance) {
		log.debug("saving CrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CrMstr persistentInstance) {
		log.debug("deleting CrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CrMstr findById(com.gopawpaw.erp.hibernate.c.CrMstrId id) {
		log.debug("getting CrMstr instance with id: " + id);
		try {
			CrMstr instance = (CrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CrMstr instance) {
		log.debug("finding CrMstr instance by example");
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
		log.debug("finding CrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CrMstr instances");
		try {
			String queryString = "from CrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CrMstr merge(CrMstr detachedInstance) {
		log.debug("merging CrMstr instance");
		try {
			CrMstr result = (CrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CrMstr instance) {
		log.debug("attaching dirty CrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CrMstr instance) {
		log.debug("attaching clean CrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CrMstrDAO) ctx.getBean("CrMstrDAO");
	}
}