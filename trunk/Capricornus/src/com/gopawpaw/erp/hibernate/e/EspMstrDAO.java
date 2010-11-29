package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EspMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EspMstr
 * @author MyEclipse Persistence Tools
 */

public class EspMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EspMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EspMstr transientInstance) {
		log.debug("saving EspMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EspMstr persistentInstance) {
		log.debug("deleting EspMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EspMstr findById(com.gopawpaw.erp.hibernate.e.EspMstrId id) {
		log.debug("getting EspMstr instance with id: " + id);
		try {
			EspMstr instance = (EspMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EspMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EspMstr instance) {
		log.debug("finding EspMstr instance by example");
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
		log.debug("finding EspMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EspMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EspMstr instances");
		try {
			String queryString = "from EspMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EspMstr merge(EspMstr detachedInstance) {
		log.debug("merging EspMstr instance");
		try {
			EspMstr result = (EspMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EspMstr instance) {
		log.debug("attaching dirty EspMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EspMstr instance) {
		log.debug("attaching clean EspMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EspMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EspMstrDAO) ctx.getBean("EspMstrDAO");
	}
}