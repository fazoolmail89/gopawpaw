package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CmfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CmfMstr
 * @author MyEclipse Persistence Tools
 */

public class CmfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CmfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CmfMstr transientInstance) {
		log.debug("saving CmfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CmfMstr persistentInstance) {
		log.debug("deleting CmfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CmfMstr findById(com.gopawpaw.erp.hibernate.c.CmfMstrId id) {
		log.debug("getting CmfMstr instance with id: " + id);
		try {
			CmfMstr instance = (CmfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CmfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CmfMstr instance) {
		log.debug("finding CmfMstr instance by example");
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
		log.debug("finding CmfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CmfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CmfMstr instances");
		try {
			String queryString = "from CmfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CmfMstr merge(CmfMstr detachedInstance) {
		log.debug("merging CmfMstr instance");
		try {
			CmfMstr result = (CmfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CmfMstr instance) {
		log.debug("attaching dirty CmfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CmfMstr instance) {
		log.debug("attaching clean CmfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CmfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CmfMstrDAO) ctx.getBean("CmfMstrDAO");
	}
}