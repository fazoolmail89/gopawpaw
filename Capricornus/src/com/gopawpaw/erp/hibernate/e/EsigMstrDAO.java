package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsigMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsigMstr
 * @author MyEclipse Persistence Tools
 */

public class EsigMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsigMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsigMstr transientInstance) {
		log.debug("saving EsigMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsigMstr persistentInstance) {
		log.debug("deleting EsigMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsigMstr findById(com.gopawpaw.erp.hibernate.e.EsigMstrId id) {
		log.debug("getting EsigMstr instance with id: " + id);
		try {
			EsigMstr instance = (EsigMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsigMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsigMstr instance) {
		log.debug("finding EsigMstr instance by example");
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
		log.debug("finding EsigMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsigMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsigMstr instances");
		try {
			String queryString = "from EsigMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsigMstr merge(EsigMstr detachedInstance) {
		log.debug("merging EsigMstr instance");
		try {
			EsigMstr result = (EsigMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsigMstr instance) {
		log.debug("attaching dirty EsigMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsigMstr instance) {
		log.debug("attaching clean EsigMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsigMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsigMstrDAO) ctx.getBean("EsigMstrDAO");
	}
}