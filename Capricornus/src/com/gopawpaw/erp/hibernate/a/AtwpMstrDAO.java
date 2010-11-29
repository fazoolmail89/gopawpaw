package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtwpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtwpMstr
 * @author MyEclipse Persistence Tools
 */

public class AtwpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtwpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtwpMstr transientInstance) {
		log.debug("saving AtwpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtwpMstr persistentInstance) {
		log.debug("deleting AtwpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtwpMstr findById(com.gopawpaw.erp.hibernate.a.AtwpMstrId id) {
		log.debug("getting AtwpMstr instance with id: " + id);
		try {
			AtwpMstr instance = (AtwpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtwpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtwpMstr instance) {
		log.debug("finding AtwpMstr instance by example");
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
		log.debug("finding AtwpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtwpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtwpMstr instances");
		try {
			String queryString = "from AtwpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtwpMstr merge(AtwpMstr detachedInstance) {
		log.debug("merging AtwpMstr instance");
		try {
			AtwpMstr result = (AtwpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtwpMstr instance) {
		log.debug("attaching dirty AtwpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtwpMstr instance) {
		log.debug("attaching clean AtwpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtwpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtwpMstrDAO) ctx.getBean("AtwpMstrDAO");
	}
}