package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KbppMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KbppMstr
 * @author MyEclipse Persistence Tools
 */

public class KbppMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KbppMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KbppMstr transientInstance) {
		log.debug("saving KbppMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KbppMstr persistentInstance) {
		log.debug("deleting KbppMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KbppMstr findById(com.gopawpaw.erp.hibernate.k.KbppMstrId id) {
		log.debug("getting KbppMstr instance with id: " + id);
		try {
			KbppMstr instance = (KbppMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KbppMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KbppMstr instance) {
		log.debug("finding KbppMstr instance by example");
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
		log.debug("finding KbppMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KbppMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KbppMstr instances");
		try {
			String queryString = "from KbppMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KbppMstr merge(KbppMstr detachedInstance) {
		log.debug("merging KbppMstr instance");
		try {
			KbppMstr result = (KbppMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KbppMstr instance) {
		log.debug("attaching dirty KbppMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KbppMstr instance) {
		log.debug("attaching clean KbppMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KbppMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KbppMstrDAO) ctx.getBean("KbppMstrDAO");
	}
}