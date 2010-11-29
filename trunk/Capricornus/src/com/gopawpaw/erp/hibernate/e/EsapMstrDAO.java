package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsapMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsapMstr
 * @author MyEclipse Persistence Tools
 */

public class EsapMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsapMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsapMstr transientInstance) {
		log.debug("saving EsapMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsapMstr persistentInstance) {
		log.debug("deleting EsapMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsapMstr findById(com.gopawpaw.erp.hibernate.e.EsapMstrId id) {
		log.debug("getting EsapMstr instance with id: " + id);
		try {
			EsapMstr instance = (EsapMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsapMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsapMstr instance) {
		log.debug("finding EsapMstr instance by example");
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
		log.debug("finding EsapMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsapMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsapMstr instances");
		try {
			String queryString = "from EsapMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsapMstr merge(EsapMstr detachedInstance) {
		log.debug("merging EsapMstr instance");
		try {
			EsapMstr result = (EsapMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsapMstr instance) {
		log.debug("attaching dirty EsapMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsapMstr instance) {
		log.debug("attaching clean EsapMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsapMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsapMstrDAO) ctx.getBean("EsapMstrDAO");
	}
}