package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbMstr
 * @author MyEclipse Persistence Tools
 */

public class KnbMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbMstr transientInstance) {
		log.debug("saving KnbMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbMstr persistentInstance) {
		log.debug("deleting KnbMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbMstr findById(com.gopawpaw.erp.hibernate.k.KnbMstrId id) {
		log.debug("getting KnbMstr instance with id: " + id);
		try {
			KnbMstr instance = (KnbMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbMstr instance) {
		log.debug("finding KnbMstr instance by example");
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
		log.debug("finding KnbMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbMstr instances");
		try {
			String queryString = "from KnbMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbMstr merge(KnbMstr detachedInstance) {
		log.debug("merging KnbMstr instance");
		try {
			KnbMstr result = (KnbMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbMstr instance) {
		log.debug("attaching dirty KnbMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbMstr instance) {
		log.debug("attaching clean KnbMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbMstrDAO) ctx.getBean("KnbMstrDAO");
	}
}