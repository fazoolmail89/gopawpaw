package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CsimMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CsimMstr
 * @author MyEclipse Persistence Tools
 */

public class CsimMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CsimMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CsimMstr transientInstance) {
		log.debug("saving CsimMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CsimMstr persistentInstance) {
		log.debug("deleting CsimMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsimMstr findById(com.gopawpaw.erp.hibernate.c.CsimMstrId id) {
		log.debug("getting CsimMstr instance with id: " + id);
		try {
			CsimMstr instance = (CsimMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CsimMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CsimMstr instance) {
		log.debug("finding CsimMstr instance by example");
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
		log.debug("finding CsimMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CsimMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CsimMstr instances");
		try {
			String queryString = "from CsimMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CsimMstr merge(CsimMstr detachedInstance) {
		log.debug("merging CsimMstr instance");
		try {
			CsimMstr result = (CsimMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CsimMstr instance) {
		log.debug("attaching dirty CsimMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsimMstr instance) {
		log.debug("attaching clean CsimMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CsimMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CsimMstrDAO) ctx.getBean("CsimMstrDAO");
	}
}