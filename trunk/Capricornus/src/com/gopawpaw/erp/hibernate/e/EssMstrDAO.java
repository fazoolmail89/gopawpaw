package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EssMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EssMstr
 * @author MyEclipse Persistence Tools
 */

public class EssMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EssMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EssMstr transientInstance) {
		log.debug("saving EssMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EssMstr persistentInstance) {
		log.debug("deleting EssMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EssMstr findById(com.gopawpaw.erp.hibernate.e.EssMstrId id) {
		log.debug("getting EssMstr instance with id: " + id);
		try {
			EssMstr instance = (EssMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EssMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EssMstr instance) {
		log.debug("finding EssMstr instance by example");
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
		log.debug("finding EssMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EssMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EssMstr instances");
		try {
			String queryString = "from EssMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EssMstr merge(EssMstr detachedInstance) {
		log.debug("merging EssMstr instance");
		try {
			EssMstr result = (EssMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EssMstr instance) {
		log.debug("attaching dirty EssMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EssMstr instance) {
		log.debug("attaching clean EssMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EssMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EssMstrDAO) ctx.getBean("EssMstrDAO");
	}
}