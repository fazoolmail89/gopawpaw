package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AcxMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AcxMstr
 * @author MyEclipse Persistence Tools
 */

public class AcxMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AcxMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AcxMstr transientInstance) {
		log.debug("saving AcxMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AcxMstr persistentInstance) {
		log.debug("deleting AcxMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AcxMstr findById(com.gopawpaw.erp.hibernate.a.AcxMstrId id) {
		log.debug("getting AcxMstr instance with id: " + id);
		try {
			AcxMstr instance = (AcxMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AcxMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AcxMstr instance) {
		log.debug("finding AcxMstr instance by example");
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
		log.debug("finding AcxMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AcxMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AcxMstr instances");
		try {
			String queryString = "from AcxMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AcxMstr merge(AcxMstr detachedInstance) {
		log.debug("merging AcxMstr instance");
		try {
			AcxMstr result = (AcxMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AcxMstr instance) {
		log.debug("attaching dirty AcxMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AcxMstr instance) {
		log.debug("attaching clean AcxMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AcxMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AcxMstrDAO) ctx.getBean("AcxMstrDAO");
	}
}