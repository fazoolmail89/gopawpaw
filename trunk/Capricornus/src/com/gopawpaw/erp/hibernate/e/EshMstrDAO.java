package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EshMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EshMstr
 * @author MyEclipse Persistence Tools
 */

public class EshMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EshMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EshMstr transientInstance) {
		log.debug("saving EshMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EshMstr persistentInstance) {
		log.debug("deleting EshMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EshMstr findById(com.gopawpaw.erp.hibernate.e.EshMstrId id) {
		log.debug("getting EshMstr instance with id: " + id);
		try {
			EshMstr instance = (EshMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EshMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EshMstr instance) {
		log.debug("finding EshMstr instance by example");
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
		log.debug("finding EshMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EshMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EshMstr instances");
		try {
			String queryString = "from EshMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EshMstr merge(EshMstr detachedInstance) {
		log.debug("merging EshMstr instance");
		try {
			EshMstr result = (EshMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EshMstr instance) {
		log.debug("attaching dirty EshMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EshMstr instance) {
		log.debug("attaching clean EshMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EshMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EshMstrDAO) ctx.getBean("EshMstrDAO");
	}
}