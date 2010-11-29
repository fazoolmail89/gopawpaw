package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbrsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbrsMstr
 * @author MyEclipse Persistence Tools
 */

public class KnbrsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbrsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbrsMstr transientInstance) {
		log.debug("saving KnbrsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbrsMstr persistentInstance) {
		log.debug("deleting KnbrsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbrsMstr findById(com.gopawpaw.erp.hibernate.k.KnbrsMstrId id) {
		log.debug("getting KnbrsMstr instance with id: " + id);
		try {
			KnbrsMstr instance = (KnbrsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbrsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbrsMstr instance) {
		log.debug("finding KnbrsMstr instance by example");
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
		log.debug("finding KnbrsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbrsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbrsMstr instances");
		try {
			String queryString = "from KnbrsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbrsMstr merge(KnbrsMstr detachedInstance) {
		log.debug("merging KnbrsMstr instance");
		try {
			KnbrsMstr result = (KnbrsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbrsMstr instance) {
		log.debug("attaching dirty KnbrsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbrsMstr instance) {
		log.debug("attaching clean KnbrsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbrsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbrsMstrDAO) ctx.getBean("KnbrsMstrDAO");
	}
}