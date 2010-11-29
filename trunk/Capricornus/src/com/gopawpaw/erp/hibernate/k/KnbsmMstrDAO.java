package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbsmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbsmMstr
 * @author MyEclipse Persistence Tools
 */

public class KnbsmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbsmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbsmMstr transientInstance) {
		log.debug("saving KnbsmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbsmMstr persistentInstance) {
		log.debug("deleting KnbsmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbsmMstr findById(com.gopawpaw.erp.hibernate.k.KnbsmMstrId id) {
		log.debug("getting KnbsmMstr instance with id: " + id);
		try {
			KnbsmMstr instance = (KnbsmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbsmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbsmMstr instance) {
		log.debug("finding KnbsmMstr instance by example");
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
		log.debug("finding KnbsmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbsmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbsmMstr instances");
		try {
			String queryString = "from KnbsmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbsmMstr merge(KnbsmMstr detachedInstance) {
		log.debug("merging KnbsmMstr instance");
		try {
			KnbsmMstr result = (KnbsmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbsmMstr instance) {
		log.debug("attaching dirty KnbsmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbsmMstr instance) {
		log.debug("attaching clean KnbsmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbsmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbsmMstrDAO) ctx.getBean("KnbsmMstrDAO");
	}
}