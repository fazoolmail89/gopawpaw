package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EnMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EnMstr
 * @author MyEclipse Persistence Tools
 */

public class EnMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EnMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EnMstr transientInstance) {
		log.debug("saving EnMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EnMstr persistentInstance) {
		log.debug("deleting EnMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EnMstr findById(com.gopawpaw.erp.hibernate.e.EnMstrId id) {
		log.debug("getting EnMstr instance with id: " + id);
		try {
			EnMstr instance = (EnMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EnMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EnMstr instance) {
		log.debug("finding EnMstr instance by example");
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
		log.debug("finding EnMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EnMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EnMstr instances");
		try {
			String queryString = "from EnMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EnMstr merge(EnMstr detachedInstance) {
		log.debug("merging EnMstr instance");
		try {
			EnMstr result = (EnMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EnMstr instance) {
		log.debug("attaching dirty EnMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EnMstr instance) {
		log.debug("attaching clean EnMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EnMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EnMstrDAO) ctx.getBean("EnMstrDAO");
	}
}