package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AcMstr
 * @author MyEclipse Persistence Tools
 */

public class AcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AcMstr transientInstance) {
		log.debug("saving AcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AcMstr persistentInstance) {
		log.debug("deleting AcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AcMstr findById(com.gopawpaw.erp.hibernate.a.AcMstrId id) {
		log.debug("getting AcMstr instance with id: " + id);
		try {
			AcMstr instance = (AcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AcMstr instance) {
		log.debug("finding AcMstr instance by example");
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
		log.debug("finding AcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AcMstr instances");
		try {
			String queryString = "from AcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AcMstr merge(AcMstr detachedInstance) {
		log.debug("merging AcMstr instance");
		try {
			AcMstr result = (AcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AcMstr instance) {
		log.debug("attaching dirty AcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AcMstr instance) {
		log.debug("attaching clean AcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AcMstrDAO) ctx.getBean("AcMstrDAO");
	}
}