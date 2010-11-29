package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KbdtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KbdtMstr
 * @author MyEclipse Persistence Tools
 */

public class KbdtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KbdtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KbdtMstr transientInstance) {
		log.debug("saving KbdtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KbdtMstr persistentInstance) {
		log.debug("deleting KbdtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KbdtMstr findById(com.gopawpaw.erp.hibernate.k.KbdtMstrId id) {
		log.debug("getting KbdtMstr instance with id: " + id);
		try {
			KbdtMstr instance = (KbdtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KbdtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KbdtMstr instance) {
		log.debug("finding KbdtMstr instance by example");
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
		log.debug("finding KbdtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KbdtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KbdtMstr instances");
		try {
			String queryString = "from KbdtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KbdtMstr merge(KbdtMstr detachedInstance) {
		log.debug("merging KbdtMstr instance");
		try {
			KbdtMstr result = (KbdtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KbdtMstr instance) {
		log.debug("attaching dirty KbdtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KbdtMstr instance) {
		log.debug("attaching clean KbdtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KbdtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KbdtMstrDAO) ctx.getBean("KbdtMstrDAO");
	}
}